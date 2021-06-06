import React ,{useState}from "react";
import {HashRouter, Route, Switch} from "react-router-dom";
import LoginComponent from "./LoginComponent";
import RegisterComponent from "./RegisterComponent";
import HeaderComponent from "./HeaderComponent";
import FooterComponent from "./FooterComponent";
import Welcome from "./Welcome";
import AdminLoginComponent from "./AdminLoginComponent";
import AdminTaskComponent from "./AdminTaskComponent";
import VehicleRegistration from "./VehicleRegistration";
function ControllerComponent(){
return(
    <div >
        <HashRouter>
           <HeaderComponent/>
            <Switch>
                <Route exact path="/" component={Welcome}/>
                <Route exact path="/adminlogin" component={AdminLoginComponent}/>
                <Route exact path="/login" component={LoginComponent}/>
                <Route exact path="/admintask" component={AdminTaskComponent}/>
                <Route exact path="/register" component={RegisterComponent}/>
                <Route exact path="/vehicledetail" component={VehicleRegistration}/>
            </Switch>
            <FooterComponent/>
        </HashRouter>

    </div>
)

}
export default ControllerComponent;
