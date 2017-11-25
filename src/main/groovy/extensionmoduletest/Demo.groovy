package extensionmoduletest

import javax.servlet.http.HttpServletRequest

class Demo {

    void someMethod(HttpServletRequest request) {
        // from here intellisense will work for invocations like these.  all of these
        // methods are extension methodes provided by org.grails.web.servlet.HttpServletRequestExtension.
        request.isXhr()
        request.isGet()
        request.isPost()
    }
}
