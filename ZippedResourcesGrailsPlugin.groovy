
class ZippedResourcesGrailsPlugin {
    def version = "3.1"

    def grailsVersion = "1.3 > *"

    def loadAfter = ['resources']
    
    def pluginExcludes = [
            "grails-app/views/error.gsp",
            "grails-app/views/index.gsp",
            "grails-app/conf/ZippedResources.groovy",
            "grails-app/conf/BootStrap.groovy",
            "web-app/css/**/*.*",
            "web-app/js/**/*.*"
    ]

    def author = "Marc Palmer"
    def authorEmail = "marc@grailsrocks.com"
    def title = "Zipped Resources"
    def description = '''\\
GZip encodes static resources using the Resources plugin framework
'''

    def documentation = "http://grails.org/plugin/zipped-resources"

    def doWithWebDescriptor = { xml ->
        // TODO Implement additions to web.xml (optional), this event occurs before 
    }

    def doWithSpring = {
        // TODO Implement runtime spring config (optional)
    }

    def doWithDynamicMethods = { ctx ->
        // TODO Implement registering dynamic methods to classes (optional)
    }

    def doWithApplicationContext = { applicationContext ->
    }

    def onChange = { event ->
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    def onConfigChange = { event ->
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }
}
