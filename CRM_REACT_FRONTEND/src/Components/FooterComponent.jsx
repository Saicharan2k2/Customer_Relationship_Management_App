import React from 'react';

function FooterComponent() {
  return (
    <div>
      <footer className="footer">
        <span className="text-muted">CRM Application &copy; {new Date().getFullYear()} | Built with ❤️ using React & Spring Boot</span>
      </footer>
    </div>
  );
}

export default FooterComponent;