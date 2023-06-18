import React from "react";
import { useNavigate } from "react-router-dom";

let Booktik = () => {
  let n = useNavigate("");

  let hom = () => {
    n("/");
  };

  return (
    <div>
      <h1>BOOK TICKET PAGE</h1>

      <form>
        <div style={{ marginBottom: "10px" }}>
          id: <input type="number" />
        </div>
        <div style={{ marginBottom: "10px" }}>
          flightname: <input type="text" />
        </div>

        <div style={{ marginBottom: "10px" }}>
          seatsavailable: <input type="number" />
        </div>
        <div style={{ marginBottom: "10px" }}>
          departure: <input type="text" />
        </div>
        <div style={{ marginBottom: "10px" }}>
          arrival: <input type="text" />
        </div>
        <div style={{ marginBottom: "10px" }}>
          price: <input type="number" />
        </div>
      </form>
      <button>confirm your ticket</button>
      <button>delete</button>
      <br />
      <button onClick={hom}>back</button>
    </div>
  );
};

export default Booktik;
