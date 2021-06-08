import  React from "react";
import axios from "axios";
import {Link} from "react-router-dom";

export default function VehicleRequestService(){

    return axios.get("http://localhost:8080/getvehreq")

}

