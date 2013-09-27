Google-Map-Demo-Project
=======================
This is a tutorial for using the google map in you application .

There are few very simple steps to create the application.
Step 1 : Creating your SHA-1 key .
Step 2 : Getting access to the google map api.
Step 3 : Adding premissions to the android mainfest file .
Step 4 : Creating the layout for the map.
Step 5 : Creating the java class to handle the map view.


______________________________________________________________________________
______________________________________________________________________________
Step 1 : Creating your SHA-1 key .
Find the java version you are using and its location: the directory will be something like  “java/jdk/bin/” or it could be “java/jre/bin” . In my case the directory was “/usr/lib/jvm/java-7-openjdk-amd64/jre/bin” (this is the full directory path).

Once located the directory ,
open terminal give the following commands : 
1. “cd /usr/lib/jvm/java-7-openjdk-amd64/jre/bin” without the quotes.The path can be different based on your java installed directory.
2. “keytool -list -v -keystore ~/.android/debug.keystore -alias androiddebugkey -storepass android -keypass android”

the above command will give you  some result , but all you need is one entry :
“SHA1: EC:A7:63:GF:6T:7Y:U8:FR:FG:...................” (Copy this key.) This is your sha1 key that google will ask for .

______________________________________________________________________________
______________________________________________________________________________
Step 2 : Go to google api and create the new API key using the sha-1 key generated above.
First goto https://code.google.com/apis/console/?pli=1#project:366684927248 google api console.
then select  “services” → scroll and look for Google Map Api v2 →  press the key at the side and change to “ON”
→ API Access → Create New Android Key → paste the SHA-1 and your app package name(shown below). 

the entry is something like this : 
“Your SHA1 Key;you package name”
eg. “EC:A7:63:GF:6T:7Y:U8:FR:FG:...................;com.webonsie.googlemapdemo”


Once the api is generated you need to paste the api key in the android mainifest file:

    <meta-data android:name="com.google.android.maps.v2.API_KEY"
            android:value="AIzaSyAE6VCv3mklyLxHpAPn_R2pOswHh15DhzE"/>
