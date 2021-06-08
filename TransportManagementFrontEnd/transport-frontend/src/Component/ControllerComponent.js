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
import UserRecordTableComponent from "./admin/UserRecordTableComponent";
import VehicleTableComponent from "./admin/VehicleTableComponent";
import VehicleRequestComponent from "./admin/VehicleRequestComponent";

import UserTaskComponent from "./user/UserTaskComponent";
import VehicleRecordComponent from "./user/VehicleRecordComponent";
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
                <Route exact path="/usertable" component={UserRecordTableComponent}/>
                <Route exact path="/vehicletable" component={VehicleTableComponent}/>
                <Route exact path="/vehiclereq" component={VehicleRequestComponent}/>

                <Route exact path="/usertask" component={UserTaskComponent}/>
                <Route exact path="/vehiclestatus" component={VehicleRecordComponent}/>
            </Switch>
            <FooterComponent/>
        </HashRouter>

    </div>
)

}
export default ControllerComponent;
