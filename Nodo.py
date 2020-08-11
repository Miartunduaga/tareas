import ClaseNodo
CN=ClaseNodo

class listasimple(object):
     def _init_(self):
         self._primero = None
         self._ultimos = None
     def getVacio(self):
         if self._primero ==None:
             return True

def setNodoAlInicio(self,elemento):
    nuevo = CN.Nodo(elemento)
    if self.getVacio()==true:
        self._primero=self._ultimo = nuevo
    else:
        nuevo._psiguiente=self._primero
        self._primero=nuevo
        pass

def setNodoAlFinal(self,elemento):
    nuevo = CN.Nodo(elemento)
    if self.getVacio()==true:
        self._primero=self._ultimo = nuevo
    else:
        self._ultimo.psiguiente=nuevo
        self._ultimo=nuevo
        pass
    
def eliminarPrimero(self):
    if self.getVacio()==True:
        print("Lista vacia,imposible eliminar")
    elif self._primero == self._ultimo:
        self._primero=None
        self._ultimo=None
        print("Elemento eliminado,la lista esta vacia")
    else:
        temp=self._primero
        self._primero=self._primero.psiguiente
        temp=None
        print ("Elemento eliminado")
def getnodoprimero(self):
    if self.getVacio()==True:
        return ("lista vacia")
    else:
        self._primero
def getnodoultimo(self):
    if self.getVacio()==True:
        return("Lista vacia")
    else:
        return self._ultimo
def imprimirlista(self):
    if self.getVacio()==true:
        print("Lista vacia")
    else:
        validar=True
        temp=self._primero
        while (validar):
            print (temp.getelemento())
        if temp==self._ultimo:
            validar=False
        else:
            temp=temp.psiguiente
ls=Nodo()

menu="""
MENU
1.Ingresar nodo
2.Mostrar nodo
3.eliminar nodo
4.salir
"""
print(menu)
opc=int(input("que desea hacer?"))
if opc is 1:
    ls.setNodoAlFinal
elif opc is 2:
    ls.imprimirlista
elif opc is 3:
    ls.eliminarPrimero
else:
    print ("saliendo")

    

