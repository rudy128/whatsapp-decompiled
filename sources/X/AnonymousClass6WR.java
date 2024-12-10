package X;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.6WR  reason: invalid class name */
public abstract class AnonymousClass6WR {
    public static final List A00(Intent intent) {
        LinkedHashSet A14 = C17880vN.A14();
        Uri data = intent.getData();
        if (data != null) {
            A14.add(data);
        }
        ClipData clipData = intent.getClipData();
        if (clipData != null) {
            int itemCount = clipData.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                Uri uri = clipData.getItemAt(i).getUri();
                if (uri != null) {
                    A14.add(uri);
                }
            }
        } else if (A14.isEmpty()) {
            return C18460wS.A00;
        }
        return C17880vN.A10(A14);
    }
}
