##########################              REAMDE.md           ###############################

![image](https://user-images.githubusercontent.com/87669207/128403417-1590decd-6240-4e02-8fba-c9b9b53c5524.png)

En la lámina se muestra la relación entre dos clases, las cuales se encuentran en un paquete llamado:
com.gm.ventas. Las clases están relacionadas por una relación en UML (Unified Modeling Language) que se conoce
como relación de agregación. Esta relación indica que una clase Orden contiene Productos. Una orden es un ticket
de venta, el cual tiene el resumen de todos los productos que se van a vender para una orden en particular.

Por ello la clase Orden contiene los métodos de agregarProducto, calcularTotal (de la orden), y mostrarOrden, este
último método su objetivo es mostrar el Id de la orden, el monto total de la orden, así como cada uno de los
productos agregados a la orden. Para almacenar varios productos, la clase Orden tiene como atributo un arreglo de
productos, y de esta manera podremos agregar varios productos a una orden, con ayuda del método
agregarProducto.

Finalmente tenemos las clases creadas por lo que para probralas ejecutamos la clase TestVentas.java ubicada en el paquete mx.com.gm.venta.test
