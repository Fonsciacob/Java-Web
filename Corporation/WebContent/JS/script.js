/**
 * 
 */

var valor=document.getElementById("ojito").value;



if(valor=="Soltero"){
	console.log(valor);
	let atributo=document.getElementById("RadioS");
	atributo.setAttribute("checked","");
}
else if(valor=="Casado"){
	console.log(valor);
	let atributo3=document.getElementById("RadioS2");
	atributo3.setAttribute("checked","");
}
else if(valor=="Divorciado"){
	console.log(valor);
	let atributo2=document.getElementById("RadioS3");
	atributo2.setAttribute("checked","");
}
