package org.jenkins.plugins.statistics.gatherer.StatisticsConfiguration

def f=namespace(lib.FormTagLib)

f.section(title:_("Statistics Notification")) {
    f.entry(title:_("Queue URL"), field:"queueUrl") {
        f.textbox(default: "http://ci.mycompany.com/api/queues")
    }
    f.entry(title:_("Build URL"), field:"buildUrl") {
        f.textbox(default: "http://ci.mycompany.com/api/builds")
    }
    f.entry(title:_("Project URL"), field:"projectUrl") {
        f.textbox(default: "http://ci.mycompany.com/api/projects")
    }
}