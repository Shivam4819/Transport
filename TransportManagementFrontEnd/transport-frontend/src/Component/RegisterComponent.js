import React,{useState}from "react";
import axios from "axios";

function RegisterComponent( ) {
    const [id,setId]=useState("");
    const [name,setName]=useState("");
    const [username,setUsername]=useState("");
    const [password,setPassword]=useState("");
    const [designation,setDesignation]= useState("");


    function displayall(){
        console.log(id);
        console.log(name);
        console.log(username);
        console.log(password);
        console.log(designation);
    }

    function sendUserValueToServer(){
        axios.post("http://localhost:8080/register",{
            id: id,
            name: name,
            username: username,
            password: password,
            designation : designation
        }).then(function (response){
            console.log(response);
        })

    }
    return(
        <div>
            ID:<input type="number" name="id" onChange={(event => setId(event.target.value))}/><br/>
            Name:<input type="text" name= "name" onChange={(event => setName(event.target.value))}/><br/>
            Username:<input type="text" name="username" onChange={(event => setUsername(event.target.value))}/><br/>
            Password:<input type="text" name="password" onChange={(event => setPassword(event.target.value))}/><br/>
            Designation:<input type="text" name="designation" onChange={(event => setDesignation(event.target.value))}/><br/>
            <button onClick={displayall}>Register</button>
            <button onClick={sendUserValueToServer}>send</button>
        </div>
    );
}
export default RegisterComponent;
