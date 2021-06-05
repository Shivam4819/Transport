import  React ,{useState}from "react";
import {Link} from "react-router-dom";

export default function Welcome(){
    return(
        <div className="App">
            <h1>Welcome to do application</h1><br/>
            <h2>Go to login page<Link to ="/login">here</Link></h2><br/>

        </div>
    )
}
