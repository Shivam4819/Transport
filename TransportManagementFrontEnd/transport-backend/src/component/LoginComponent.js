import React,{useState,useEffect} from "react";

import { Button } from 'reactstrap';
function LoginComponent( ) {
    const [passWord, setPassWord] = useState('');

    useEffect(()=>{
        console.log("zdxkijhgijxdfilbvfgh;")
    },[])

    return (
        <div className="App">
            <input type="text" onChange={(event)=>{
                console.log(event.target.value)
                setPassWord(event.target.value)
            }}/>
        </div>
    );
}

export default LoginComponent;
