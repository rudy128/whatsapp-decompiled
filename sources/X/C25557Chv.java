package X;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import java.io.IOException;

/* renamed from: X.Chv  reason: case insensitive filesystem */
public class C25557Chv {
    public int A00;
    public int A01;
    public String A02;

    /* JADX WARNING: type inference failed for: r4v0, types: [X.C53, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v1, types: [X.Chv, java.lang.Object] */
    public static C25557Chv A00(String str) {
        String string;
        MediaExtractor mediaExtractor = new MediaExtractor();
        ? obj = new Object();
        obj.A00 = mediaExtractor;
        try {
            mediaExtractor.setDataSource(str);
            C24919CPq A002 = C25873Cnh.A00(obj);
            if (A002 != null) {
                MediaFormat mediaFormat = A002.A01;
                ? obj2 = new Object();
                if (mediaFormat.containsKey("channel-count")) {
                    obj2.A00 = mediaFormat.getInteger("channel-count");
                    if (mediaFormat.containsKey("sample-rate")) {
                        obj2.A01 = mediaFormat.getInteger("sample-rate");
                        if (mediaFormat.containsKey("mime") && (string = mediaFormat.getString("mime")) != null) {
                            obj2.A02 = string;
                            return obj2;
                        }
                    }
                }
            }
            obj.A00.release();
            return null;
        } catch (BW1 | IOException unused) {
            return null;
        } finally {
            obj.A00.release();
        }
    }
}
