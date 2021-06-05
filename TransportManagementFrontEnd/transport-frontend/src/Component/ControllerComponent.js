import React ,{useState}from "react";
import {HashRouter, Route, Switch} from "react-router-dom";
import LoginComponent from "./LoginComponent";
import RegisterComponent from "./RegisterComponent";
import HeaderComponent from "./HeaderComponent";
import FooterComponent from "./FooterComponent";
import Welcome from "./Welcome";
import Demo from "./Demo";
function ControllerComponent(){
return(
    <div >
        <HashRouter>
           <HeaderComponent/>
            <Switch>
                <Route exact path="/" component={Welcome}/>
                <Route exact path="/login" component={LoginComponent}/>
                <Route exact path="/register" component={RegisterComponent}/>
            </Switch>
            <FooterComponent/>
        </HashRouter>

    </div>
)

}
export default ControllerComponent;
