$('#editWorkModal').on('shown.bs.modal', function (e) {
let btn=(e.relatedTarget)
let name=btn.getAttribute('data-name')
let id=btn.getAttribute('data-id')
let ape=btn.getAttribute('data-ape')
let state=btn.getAttribute('data-state')

let slr=btn.getAttribute('data-slr')
let std=btn.getAttribute('data-study')
let child=btn.getAttribute('data-child')
let eps=btn.getAttribute('data-eps')
let tlf=btn.getAttribute('data-tlf')
let dir=btn.getAttribute('data-dir')
let apr=btn.getAttribute('data-apr')


$("#id_work").val(id)
$("#name_work").val(name)
$("#ape_work").val(ape)
$("#state_work").val(state)
$("#slr_work").val(slr)
$("#std_work").val(std)
$("#child_work").val(child)
$("#eps_work").val(eps)
$("#tlf_work").val(tlf)
$("#dir_work").val(dir)
$("#apr_work").val(apr)
})

$('#deleteAsc').on('shown.bs.modal', function (e) {
	let btn=(e.relatedTarget);
	let id=btn.getAttribute('data-id');
	$("#idAsc").val(id);
})

function deleteAs(event){
	let btn=(event.target);
	let id=btn.getAttribute('data-id');
	console.log(btn);
	let parrafo=document.createElement('p');
	let text=document.createTextNode(`Seguro que desea eliminar al Asociado con el Id: ${id}`);
	parrafo.appendChild(text);
	parrafo.setAttribute('class','texto');
	let container= document.getElementById('cont');
	container.appendChild(parrafo);

	let parrafos=document.getElementsByClassName('texto');
	let padreparrafo=parrafos[0].parentNode;
	padreparrafo.replaceChild(parrafo,parrafos[0]);
}


