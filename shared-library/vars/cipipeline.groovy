def call(){

    node('WORKSTATION'){
        stage("compile"){
            common.compile()
            print 'compilation done'
        }
        stage("test"){
            print 'test done'
        }
        stage("code quality"){
            print 'code quality done'
        }
        stage("code security"){
            print 'code security done'
        }
        stage("release"){
            print 'release done'
        }
    }
}