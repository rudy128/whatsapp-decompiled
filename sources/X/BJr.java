package X;

import android.view.View;
import android.view.Window;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;

public class BJr extends C123496Ur {
    public final Window A00;
    public final C25474CgT A01;

    public void A01() {
        int i = 1;
        do {
            if ((i & 8) != 0) {
                if (i == 1) {
                    A07(4);
                    this.A00.clearFlags(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
                } else if (i == 2) {
                    A07(2);
                } else if (i == 8) {
                    this.A01.A00.A02();
                }
            }
            i <<= 1;
        } while (i <= 256);
    }

    public void A02(int i) {
        int i2 = 1;
        do {
            if ((i & i2) != 0) {
                int i3 = 4;
                if (i2 != 1) {
                    i3 = 2;
                    if (i2 != 2) {
                        if (i2 == 8) {
                            this.A01.A00.A01();
                        }
                    }
                }
                A06(i3);
            }
            i2 <<= 1;
        } while (i2 <= 256);
    }

    public void A00() {
        A07(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
        A06(ZipDecompressor.UNZIP_BUFFER_SIZE);
    }

    public void A06(int i) {
        View decorView = this.A00.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public void A07(int i) {
        View decorView = this.A00.getDecorView();
        decorView.setSystemUiVisibility((i ^ -1) & decorView.getSystemUiVisibility());
    }

    public BJr(Window window, C25474CgT cgT) {
        this.A00 = window;
        this.A01 = cgT;
    }
}
