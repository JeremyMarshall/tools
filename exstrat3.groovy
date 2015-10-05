def online = [:]

//clearly master is online or we wouldn't be here
online['master'] = true

jenkins.slaves.each { 
  println('====================');
  println('Name: ' + it.name);
  println('getLabelString: ' + it.getLabelString());
  println('getNumExectutors: ' + it.getNumExecutors());
  println('getRemoteFS: ' + it.getRemoteFS());
  println('getMode: ' + it.getMode());
  println('getRootPath: ' + it.getRootPath());
  println('getDescriptor: ' + it.getDescriptor());
  println('getComputer: ' + it.getComputer());
  println('\tcomputer.isAcceptingTasks: ' + it.getComputer().isAcceptingTasks());
  println('\tcomputer.isLaunchSupported: ' + it.getComputer().isLaunchSupported());
  println('\tcomputer.getConnectTime: ' + it.getComputer().getConnectTime());
  println('\tcomputer.getDemandStartMilliseconds: ' + it.getComputer().getDemandStartMilliseconds());
  println('\tcomputer.isOffline: ' + it.getComputer().isOffline());
  println('\tcomputer.countBusy: ' + it.getComputer().countBusy());
  ////if (aSlave.name == 'NAME OF NODE TO DELETE') {
  ////  println('Shutting down node!!!!');
  ////  aSlave.getComputer().setTemporarilyOffline(true,null);
  ////  aSlave.getComputer().doDoDelete();
  //}
  println('\tit.getLog: ' + it.getComputer().getLog());
  println('\tit.getBuilds: ' + it.getComputer().getBuilds());
  
  if (! it.getComputer().isAcceptingTasks() || it.getComputer().isOffline() ) {
    online[it.name] = false
  } else {
    online[it.name] = true
  }
}

println( online )

combinations.each {
	
  	//so the node could be offline or we know nothing of
  	//it as it ha been deleted
  	if(!online[it.NODE])
  		return
  
	if(it.axis2 == 'z')
  		return
    
	result[it.axis2] = result[it.axis2] ?: []
  	result[it.axis2] << it
}

println 'here'

result
