window.addEventListener('load', function (event) {

  event.preventDefault();
  const url = '/pacientes/lista';
  const settings = {
    method: 'GET'
  }

  fetch(url, settings)
    .then(response => response.json())
    .then(data => {

      for (paciente of data) {

        let deleteButton =
                    `<button id= "btn_delete_${paciente.id}" type="button" onclick="pacienteDeleteBy(${paciente.id})" class="btn btn-danger btn_delete">
                        &times
                     </button>`;


        let tr_id = 'tr_' + paciente.id;
        let pacienteRow =
        `<tr id=${tr_id}>
            <td>${paciente.id}</td>
            <td class=td_nombre>${paciente.nombre}</td>
            <td class=td_apellido>${paciente.apellido} </td>
            <td class=td_dni>${paciente.dni}</td>
            <td class=td_fecha>${paciente.fechaIngreso}</td>
            <td class=td_direccion>${paciente.domicilio.calle} ${paciente.domicilio.numero}</td>
            <td class=td_localidad>${paciente.domicilio.localidad}</td>
            <td class=td_provincia>${paciente.domicilio.provincia}</td>
            <td>${deleteButton}</td>
        </tr>`;

        $('#pacienteTable tbody').append(pacienteRow);
      };

    })
})