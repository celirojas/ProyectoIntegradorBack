window.addEventListener('load', function (event) {

  event.preventDefault();
  const url = '/odontologos/lista';
  const settings = {
    method: 'GET'
  }

  fetch(url, settings)
    .then(response => response.json())
    .then(data => {
      for (odontologo of data) {
        console.log(odontologo)

        let deleteButton =
            `<button id= "btn_delete_${odontologo.id}" type="button" onclick= "deleteBy(${odontologo.id})" class="btn btn-danger btn_delete">
                &times
             </button>`;


        let tr_id = 'tr_' + odontologo.id;
        let odontologoRow = '<tr id=\"' + tr_id + "\"" + '>' +
          '<td>' + odontologo.id + '</td>' +
          '<td class=\"td_nombre\">' + odontologo.nombre + '</td>' +
          '<td class=\"td_apellido\">' + odontologo.apellido + '</td>' +
          '<td class=\"td_matricula\">' + odontologo.matricula + '</td>' +
          '<td>' + deleteButton + '</td>' +
          '</tr>';
        console.log(odontologoRow);
        console.log($('#odontologoTable tbody'));
        $('#odontologoTable tbody').append(odontologoRow);
      };

    })
})