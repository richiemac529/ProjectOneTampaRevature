/**
 * 
 */
window.onload = function() {
	getRequests();
}

function getRequests() {
	let xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (xhttp.readyState == 4 && xhttp.status == 200) {
			let list = JSON.parse(xhttp.responseText);
			setValues(list);
		}
	}
	xhttp.open("GET", "/ProjectOne/html/LoadTable.do", true);
	xhttp.send();
}

function setValues(list) {
    
    let table = document.getElementById("reimbtable");
    
    for (r in list) {
        let row = document.createElement("tr");
        let tdUser = document.createElement("td");
        let tdFirstName = document.createElement("td");
        let tdLastName = document.createElement("td");
        let tdType = document.createElement("td");
        let tdAmount = document.createElement("td");
        let tdSubmitDate = document.createElement("td");
        let tdResolveDate = document.createElement("td");
        let tdStatus = document.createElement("td");
        let tdDescription = document.createElement("td");
        let tdTicketId = document.createElement("td");
        
        switch (list[r].type) {
        case 1:
        	tdType.innerHTML = "Lodging";
            break;
        case 2:
        	tdType.innerHTML = "Travel";
            break;
        case 3:
        	tdType.innerHTML = "Food";
            break;
        case 4:
        	tdType.innerHTML = "Other";
            break;
        }
        tdAmount.innerHTML = "$" + list[r].amount;
        tdDescription.innerHTML = list[r].description;
        
        row.appendChild(tdUser);
        row.appendChild(tdFirstName);
        row.appendChild(tdLastName);
        row.appendChild(tdType);
        row.appendChild(tdAmount);
        row.appendChild(tdSubmitDate);
        row.appendChild(tdResolveDate);
        row.appendChild(tdStatus);
        row.appendChild(tdDescription);
        row.appendChild(tdTicketId);
       
        table.appendChild(row);
    }
}