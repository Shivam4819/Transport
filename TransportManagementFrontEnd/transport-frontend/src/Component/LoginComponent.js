import React ,{useState}from 'react'
import axios from "axios";
function LoginComponent(){
    const [username,setUser]=useState("");
    const [password,setPass]=useState("");
    function display(){

        console.log(username);
        console.log(password);
    }
    function sendtoSpring(){
        axios.post("http://localhost:8080/loginuser",{
            username: username,
            password: password

        }).then(function (response) {
            console.log(response);
        })
    }
    return(
        <div className="LoginClass" >
            Username:<input type="text" name="username" placeholder="username" onChange={(event => setUser(event.target.value))}/><br/>
            Password:<input type="text" name="password" placeholder="password" onChange={(event => setPass(event.target.value))}/><br/>
            <button onClick={display}>Login</button>
            <button onClick={sendtoSpring}>sendData</button>


        </div>
    )
}
export default LoginComponent
