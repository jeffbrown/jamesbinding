package demo

import grails.validation.Validateable

class DemoController {

    static allowedMethods = [generate: 'POST']

    def generate(ProjectMetaDataCommand co) {
        [command: co]
    }
}

class ProjectMetaDataCommand implements Validateable {
    String name
    String version
    String profile = "web"
    List<String> features = []

    static constraints = {
    }
}
