import React from 'react';
import translations from '../../en';
import LanguageSelector from '../LanguageSelector';

const { dashboard } = translations.navbar;

const Header = () => (
  <div className="d-flex align-items-center justify-content-between w-100">
    <a
      href={dashboard.link}
      className="navbar-brand brand-name"
    >
      Openboxes
    </a>
    <LanguageSelector />
  </div>
);

export default Header;
