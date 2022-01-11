import {ReactComponent as GithubIcon} from 'assets/img/github.svg';
import './navbar-styles.css';

function Navbar() {

    return (
        <header>
        <nav className="container">
            <div className="dsmovie-nav-content">
                <h1>DSMovie</h1>
                <a href="https://github.com/leandro-ikehara" target="_blank" rel="noreferrer">
                    <div className="dsmovie-contact-container">
                        <GithubIcon />
                        <p className="dsmovie-contact-link">/leandro-ikehara</p>
                    </div>
                </a>
            </div>
        </nav>
        </header>
    );
}

export default Navbar;