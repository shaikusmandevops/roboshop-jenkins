def compile() {
    if(env.code_type=='maven'){
        print 'maven'
    }
    if(env.code_type=='nodejs'){
        print 'nodejs'
    }
    if(env.code_type=='python'){
        print 'python'
    }
    if(env.code_type=='static'){
        print 'static'
    }

}
