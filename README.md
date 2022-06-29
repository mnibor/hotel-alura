Challenge ONE | Java | Back-end | Hotel Alura


Primeros Pasos:
small_blue_diamond Marca este proyecto con una star
small_blue_diamond Sigue las orientaciones que tenemos en este repositorio. books
small_blue_diamond ¡Visita la página del desafío haciendo clic aquí! Link do Challenge page_with_curl

desktop_computer Tecnologías Utilizadas:
Java
Eclipse
Biblioteca JCalendar
MySql
Plugin WindowBuilder
warning Importante! warning
coffee Use Java versión 8 para compatibilidad.

memo Recomendamos usar el editor de Eclipse para compatibilidad con la Interfaz Gráfica.

art La interfaz contiene dos métodos importantes:

setResizable(false): determina el tamaño de la ventana, y a través del parámetro false, la pantalla no se puede maximizar;
setLocationRelativeTo(null): determina la ubicación de la ventana, y a través del parámetro null la mantiene centrada en la pantalla.
Para este desafío, concéntrate en la parte lógica y la conexión con la base de datos, después de completar el desafío, siéntate libre de agregar nuevas funciones y modificar la interfaz gráfica.
mag ¡Analizando nuestro repositorio!
Este es el repositorio base de nuestro proyecto, en el encontrarás:
small_blue_diamond src/views: carpeta con toda la interfaz gráfica de las pantallas necesarias para desarrollar el programa;
small_blue_diamond src/imagenes: carpeta con imágenes que puedes usar en tu proyecto. Siéntete libre de usar otros, si lo deseas;

arrow_down Download
Cómo descargar:
small_blue_diamond Fork
1 - Haz el fork del proyecto. En la parte superior derecha, al hacer clic en el icono se creará un repositorio del proyecto en tu cuenta personal de GitHub.



2 - Una vez que tengas el repositorio "forkado" en tu cuenta, comprueba si la URL de la página es la del repositorio de tu cuenta.



3 - Haz clic en la opción Code. Se mostrarán tres formas de instalar el repositorio en su máquina, y destacamos dos:




small_blue_diamond Clonar o descargar el ZIP
1 - Para clonar, simplemente copia el url resaltado en la imagen y ubicado justo debajo del HTTPS, crea una carpeta en tu computadora, abre el cmd o el git bash dentro de esa carpeta y luego ingresa el comando git clone y con el botón derecho del mouse dentro del terminal haz click en la opcion Paste para pegar el url y presiona Enter.



2 - La segunda opción es descargar el código en un paquete "zipado" y extraer la carpeta a tu computadora.


memo Eclipse
¿Cómo importar mi proyecto a Eclipse?
1 - Una vez dentro del Editor al lado izquierdo, haz clic en el Files que está en el menú en la parte superior, elige la opción Open Projects from File System.



Luego haz click en Directory y ubica el directorio del proyecto "clonado" o "extraído" en tu computadora. Haz click en Finish para completar la importación.



2 - La segunda forma de importar es en File en la opción Import. O a través del Project Explorer haz clic en el campo vacío con el botón derecho del mouse y elijas la opción Import.





Si te decides por el Import, se abrirá la ventana correspondiente. Haz clic en la opción Existing Projects Into Workspace y en el botón Next.



Luego haz clic en el botón Browse y busca el proyecto en el directorio local.



date JCalendar
Tras realizar la importación a tu editor, es necesario instalar la librería JCalendar, de lo contrário, el proyecto presentará un error y no será posible abrir la ventana de Reservas.

Para instalar, se necesita descargar el paquete a través de ese enlace: small_blue_diamond Link para el JCalendar



El siguiente paso es extraer los archivos a una carpeta e importar los archivos desde la carpeta lib a una carpeta local e importar los archivos a Eclipse.



Archivos de carpeta lib:



Haz click con el botón derecho encima del proyecto ubicado en el Package Explorer, elijas la opción Build Path y Configure Build Path.



El proyecto tendrá un mensaje de error que indica que la ruta de la biblioteca no existe en tu computadora. Haz click en Libraries, luego en Classpath seleccione el archivo JCalendar, elije la opción Remove y Apply and Close.



Para importar el Jcalendar desde tu computadora, después de haber "extraído" los archivos de la descarga, pulsa en ClassPath y luego en Add External JARS agrega uno por uno o selecciona todos de una vez y haz click en Apply and Close.



Por lo tanto, el proyecto debe contener los siguientes archivos después de las importaciones:



construction Proyecto
Al clonar o descargar el proyecto base y tener instalado el JCalendar, tendrás esta presentación al ejecutar el proyecto en Eclipse:


warning Descargué el proyecto pero los caracteres especiales no funcionan:
Si tu proyecto tiene errores como los de la imagen, siga los pasos a continuación:



Ve a Window y haz clic en Preferences.



Luego haz clic en General y en Workspace. Si tu Text File Enconding no está con el Default (UTF-8), haz clic en Other, y eliges la opción UTF-8, y finaliza haciendo clic Apply and Close.



warning Descargué el proyecto pero los caracteres especiales no funcionan:
Si tu proyecto tiene errores como los de la imagen, sigue los pasos a continuación:



Ve a Window y haz click en Preferences.



Luego haz click en General y en Workspace. Si tu Text File Enconding no está con el Default (UTF-8), haz click en Other, y elige la opción UTF-8, finaliza haciendo click Apply and Close.



bar_chart Banco de Dados
¿Cómo importar MySqlConnector al proyecto?
Es la misma ruta descrita para importar el JCalendar, haga clic con el botón derecho en el proyecto, Build Path, Configure Build Path, Libraries, Add External JARs. Para encontrar la ruta de este archivo .jar, ve al disco duro de tu computadora e ingresa a la carpeta Archivos de Programas (x86).

Archivos de Programas (x86):


MySQL


Connector J 8.0:


My SQL Connector Java:


Modelado de tablas:
Para este reto te proponemos dos tablas: Reservas y Huéspedes. La tabla de huéspedes debe contener la clave externa (foreign key) idReserva.





🗔 Plugin WindowBuilder
En el menú de Eclipse, ir a la pestaña Help y seleccione la opción Eclipse Marketplace.



En la barra de búsqueda, ingresa window builder y haz click en Go. Después de la búsqueda, selecciona la primera opción y haz click en Install.



En la siguiente ventana, selecciona el botón Confirm.



Haz click en la opción para aceptar los Términos de Uso, y para finalizar haz clic en Finish.



Después de la instalación, será necesario reiniciar el Eclipse.

¿Cómo abrir cada ventana de diseño?
Una vez que completes el desafío, si quieres explorar el Window Builder y agregar nuevas ventanas, o cambiar el diseño de las existentes, haz clic en el archivo .java, y luego en Open With y finalmente en Window Builder Editor.



La pestaña de Design se abrirá por encima de la zona del Console. ¡Aquí puedes liberar al artista que llevas dentro de ti!



mailbox_with_mail Entrega
¿Cómo incluir mi proyecto con el "#" del desafío?
Ten el Fork del proyecto en tu repositorio en Github.
Utilize el topico #challengeonehotelaluralatam
Ve a la pestaña derecha de tu proyecto y haz clic en el engranaje de configuración en la sección About, seleccione el campo topics e inserte la etiqueta challengeonehotelaluralatam
¿Cómo hago la entrega final de mi Proyecto?
Rellena el siguiente formulario con tus datos personales, junto con el enlace de tu repositorio. small_blue_diamond Link para o formulário


Ve a tu correo electrónico y canjea tu insignia obtenida al completar otro desafío del Proyecto ONE! trophy

¡No olvides poner un enlace o video de tu proyecto en Linkedin! Etiqueta a #Oracle y #AluraLatam checkered_flag

orange_heart Oracle


blue_heart Alura Latam

