import React ,{useState}from "react";
import {HashRouter, Route, Switch} from "react-router-dom";
import LoginComponent from "./user/LoginComponent";
import RegisterComponent from "./admin/RegisterComponent";
import HeaderComponent from "./HeaderComponent";
import FooterComponent from "./FooterComponent";
import Welcome from "./Welcome";
import AdminLoginComponent from "./admin/AdminLoginComponent";
import AdminTaskComponent from "./admin/AdminTaskComponent";
import VehicleRegistration from "./admin/VehicleRegistration";
import UserTable from "./admin/UserTable";
import VehicleTable from "./admin/VehicleTable";
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
                <Route exact path="/usertable" component={UserTable}/>
                <Route exact path="/vehicletable" component={VehicleTable}/>
            </Switch>
            <FooterComponent/>
        </HashRouter>

    </div>
)

}
export default ControllerComponent;
