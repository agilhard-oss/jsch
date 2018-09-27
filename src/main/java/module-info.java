module net.agilhard.jsch {
    requires transitive java.security.jgss;
    requires net.agilhard.jzlib;
    exports net.agilhard.jsch;
    exports net.agilhard.jsch.jce;
    exports net.agilhard.jsch.jcraft;
    exports net.agilhard.jsch.jgss;

}
