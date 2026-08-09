package sounds;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class reproduccionSonidos {
   
    public static void main(String[] args) {

        try {
            // se obtiene un clip de sonido / a new wav file is getted
            Clip bark   =  AudioSystem.getClip();
            Clip meow   =  AudioSystem.getClip();
            Clip gallop =  AudioSystem.getClip();

            // It is loaded from the wavfile / se carga del archivo wav   
            bark.open(AudioSystem.getAudioInputStream(new File("2-reproduccion\\\\src\\\\main\\\\resources\\\\sounds\\\\ladrido.wav")));
            meow.open(AudioSystem.getAudioInputStream(new File("2-reproduccion\\src\\main\\resources\\sounds\\maullido.wav")));
            gallop.open(AudioSystem.getAudioInputStream(new File("2-reproduccion\\\\src\\\\main\\\\resources\\\\sounds\\\\galope.wav")));


            // we start to reproduce (play) the file   // ccomenzamosl al reproducci'on
            bark.start();
            meow.start();
            gallop.start();
            // espera mientras se esta reproduciento  / waiting while the file is playing
            while(bark.isRunning() || meow.isRunning() || gallop.isRunning() ){
                Thread.sleep(1000);
            }

            //once it's finished, we close the file. / una vez termina la reproducci'on se cierra el archivo
            bark.close();
            meow.close();
            gallop.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}