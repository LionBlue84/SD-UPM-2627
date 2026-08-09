package sounds;

import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;


public class Movie extends Component {
    private static final long serialVersionUID = 1L;

    BufferedImage[] imgs;   // array to store images 

    int cImg = 0 ; // current image index
    int numImages = 0 ; // number of images
    int width = 0 ; // width of the image
    int cWidth = 0 ; // current image index
    int widthFrame = 0 ; 

    Movie(String source,int numImages){
        int i = 0;
        imgs = new BufferedImage[numImages];
        this.numImages = numImages;

        for (i = 0 ; i < numImages ; i++){
            try { // load the image sequences in the array
                imgs[i] = ImageIO.read(new File(source + Integer.toString(i) + ".gif"));
        } catch (IOException e) {
            e.toString();
        }
    }

    width = imgs[0].getWidth();
    widthFrame = width * numImages;

    }

    public void nextMovement() {
        cImg =  (cImg + 1) % numImages;
        cWidth = (cImg + 1) % (numImages * 4);
    }

    public void paint(Graphics g){
        // the image will be painted each 1/4 of the image size
        g.drawImage(imgs[cImg], cWidth * width / 4, 0, null);
    }

    public Dimension getPreferredSize(){
        // this method sets the dimension of the vancas where the imagees will be displayed. 
        return new Dimension(imgs[cImg].getWidth(null) * numImages, imgs[cImg].getHeight(null));
    }


    public static void main(String[] args) {
        // 1. Create a movie with images...  
        Movie photoSeq = new Movie("2-reproduccion\\\\src\\\\main\\\\resources\\\\fotograms\\\\horse", 5);
        //Movie photoSeq = new Movie ("path");

        // 2. create a frame
        JFrame f = new JFrame();
        f.setBackground(Color.WHITE);
        //f.setBackground(Color.LIGHT_GRAY);

        // 2.a close when the close button is clicked
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 3. set the window to the center 
        f.setLocationRelativeTo(null);

        // put the photo in the frame
        f.add(photoSeq);

        while(true){
            //Size the frame
            f.pack();
            f.repaint();
            //show the frame
            f.setVisible(true);

            try{
                Thread.sleep(150);   // how fast images are rendered?
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            //show the movement
            photoSeq.nextMovement();




        }


    }
}
