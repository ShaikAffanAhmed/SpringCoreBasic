package my.app;

public class Service 
{
   private Repository Repo;

   public Service() {
	super();
}

public Repository getRepo() {
	return Repo;
}

public void setRepo(Repository repo) {
	Repo = repo;
}

@Override
public String toString() {
	return "Service [Repo=" + Repo + "]";
}
   
   
}
