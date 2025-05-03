import React from 'react';
import { Link } from 'react-router-dom';

function HeaderComponent() {
  return (
    <div>
      <header>
        <nav className="navbar navbar-expand-md navbar-dark bg-dark">
          <div><Link to={"https://github.com/Saicharan2k2/Customer_Relationship_Management_App.git"} className="navbar-brand">Customer Relationship Management App</Link></div>
        </nav>
      </header>
    </div>
  );
}

export default HeaderComponent;