public class Test {

    public static void main(String[] args) {

//        int n = Integer.parseInt(args[0]);
        int n = 1;
        Complex[] x = new Complex[n];

        // original data
        for (int i = 0; i < n; i++) {
            x[i] = new Complex(i, 0);
            x[i] = new Complex(-2 * Math.random() + 1, 0);
        }
        FFT.show(x, "x");

        // FFT of original data
        Complex[] y = FFT.fft(x);
        FFT.show(y, "y = fft(x)");

        // take inverse FFT
        Complex[] z = FFT.ifft(y);
        FFT.show(z, "z = ifft(y)");

        // circular convolution of x with itself
        Complex[] c = FFT.cconvolve(x, x);
        FFT.show(c, "c = cconvolve(x, x)");

        // linear convolution of x with itself
        Complex[] d = FFT.convolve(x, x);
        FFT.show(d, "d = convolve(x, x)");
    }
}
