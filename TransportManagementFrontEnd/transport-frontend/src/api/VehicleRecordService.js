import  React from "react";
import axios from "axios";
import {Link} from "react-router-dom";

export default function VehicleRecordService(){

    return axios.post("http://localhost:8080/specific")

}

