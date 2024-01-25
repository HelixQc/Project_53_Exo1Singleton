  class IOrbiteAutour {
  <<Interface>>
+ Orbiter(Astre) void
  }
  class Main {
+ main(String[]) void
  }
  class Planet {
+ Orbiter(Astre) void
+ Afficher() void
+ ajouterSatellite(Astre) void
  }
  class Soleil {
+ ajouterSatellite(Astre) void
+ Afficher() void
  Soleil instance
  }
  class Terre {
+ Afficher() void
+ Orbiter(Astre) void
  }
```mermaid
Planet  -->  Astre
Planet  ..>  IAJouterSatellite
Planet  ..>  IAffichable
Planet  ..>  IOrbiteAutour
Soleil  -->  Astre
Soleil  ..>  IAJouterSatellite
Soleil  ..>  IAffichable
Terre  -->  Planet 
```
