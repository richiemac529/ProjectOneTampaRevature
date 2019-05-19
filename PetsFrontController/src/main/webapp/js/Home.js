/**
 * 
 */

window.onload = function(){
	getPetInfo();
}

function getPetInfo(){
	
	let xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function(){
		if(xhttp.readyState == 4 && xhttp.status == 200){
			let pet = JSON.parse(xhttp.responseText);
			setValues(pet);
		}
	}
	
	xhttp.open("GET", 'http://localhost:9005/PetsFrontController/html/AdminHome.do', true);
	xhttp.send();
}

function setValues(pet){
	document.getElementById("Amount").innerHTML =  pet.Amount;
	document.getElementById("type").innerHTML =  pet.type;
	document.getElementById("Description").innerHTML =  pet.Description;
}





