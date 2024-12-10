package X;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.DragEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.D4n  reason: case insensitive filesystem */
public class C26573D4n implements View.OnDragListener {
    public C23837Bqu A00;
    public final C34501ka A01;
    public final Activity A02;
    public final C26982DOe A03;
    public final AnonymousClass11P A04;
    public final AnonymousClass18K A05;

    public C26573D4n(Context context, C26982DOe dOe, AnonymousClass11P r4, AnonymousClass18K r5, C34501ka r6) {
        this.A03 = dOe;
        this.A02 = AnonymousClass1L9.A00(context);
        this.A04 = r4;
        this.A05 = r5;
        this.A01 = r6;
    }

    public boolean onDrag(View view, DragEvent dragEvent) {
        String str;
        ClipData.Item itemAt;
        String str2;
        int action = dragEvent.getAction();
        if (action == 1) {
            view.setVisibility(0);
            view.setBackgroundColor(-2134061876);
            C23837Bqu bqu = new C23837Bqu();
            this.A00 = bqu;
            bqu.A07 = C17890vO.A0Q();
            this.A00.A04 = C108955ca.A0m();
            return true;
        } else if (action == 3) {
            if (Build.VERSION.SDK_INT >= 24) {
                this.A02.requestDragAndDropPermissions(dragEvent);
            }
            C23831Bqo bqo = new C23831Bqo();
            C23837Bqu bqu2 = this.A00;
            bqo.A04 = bqu2.A07;
            if (dragEvent.getClipData() != null) {
                Long A0n = C17880vN.A0n(dragEvent.getClipData().getItemCount());
                bqu2.A05 = A0n;
                bqo.A01 = A0n;
                HashSet A12 = C17880vN.A12();
                for (int i = 0; i < dragEvent.getClipData().getItemCount(); i++) {
                    Uri uri = dragEvent.getClipData().getItemAt(i).getUri();
                    if (uri != null) {
                        int A002 = this.A01.A00(uri);
                        if (A002 == -1) {
                            str2 = "invalid";
                        } else if (A002 == 9) {
                            str2 = "document";
                        } else if (A002 == 13) {
                            str2 = "gif";
                        } else if (A002 == 1) {
                            str2 = "photo";
                        } else if (A002 == 2) {
                            str2 = "audio";
                        } else if (A002 == 3) {
                            str2 = "video";
                        } else if (A002 != 4) {
                            str2 = "none";
                        } else {
                            str2 = "contact";
                        }
                        A12.add(str2);
                    }
                }
                StringBuilder A10 = AnonymousClass000.A10();
                Iterator it = A12.iterator();
                while (it.hasNext()) {
                    A10.append(C17880vN.A0v(it));
                    BE6.A1K(A10);
                }
                String obj = A10.toString();
                bqu2.A06 = obj;
                bqo.A03 = obj;
            }
            C26982DOe dOe = this.A03;
            ClipData clipData = dragEvent.getClipData();
            dOe.A00 = bqo;
            if (clipData != null && clipData.getDescription() != null) {
                if (!clipData.getDescription().hasMimeType("text/plain") && !clipData.getDescription().hasMimeType("text/html")) {
                    ArrayList A13 = AnonymousClass000.A13();
                    for (int i2 = 0; i2 < clipData.getItemCount(); i2++) {
                        ClipData.Item itemAt2 = clipData.getItemAt(i2);
                        if (!(itemAt2 == null || itemAt2.getUri() == null)) {
                            A13.add(itemAt2.getUri());
                        }
                    }
                    Iterator it2 = A13.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            C26982DOe.A01(dOe, A13);
                            break;
                        }
                        if (dOe.A09.A00((Uri) it2.next()) == 9) {
                            AnonymousClass1E7 A0E = dOe.A04.A0E(dOe.A08);
                            C24921Me r7 = dOe.A05;
                            Activity activity = dOe.A02;
                            AnonymousClass1KW r9 = dOe.A07;
                            C124346Xz.A00(activity, new C88794an(dOe, 6), new AnonymousClass4bC((Object) dOe, (Object) A13, 11), new AnonymousClass4bA(dOe, 16), r7, A0E, r9, A13, (Map) null).show();
                            break;
                        }
                    }
                } else {
                    if (clipData.getItemCount() != 1 || (itemAt = clipData.getItemAt(0)) == null || itemAt.getText() == null) {
                        str = "";
                    } else {
                        str = itemAt.getText().toString();
                    }
                    if (!TextUtils.isEmpty(str)) {
                        dOe.A0A.setText(str);
                    }
                }
            } else {
                dOe.A03.A08(2131896086, 0);
                C26982DOe.A00(dOe, "clip_data_or_clip_description_null");
            }
            this.A00.A00 = C108955ca.A0m();
            return true;
        } else if (action == 4) {
            view.setBackgroundColor(0);
            C23837Bqu bqu3 = this.A00;
            bqu3.A01 = C108955ca.A0m();
            this.A05.CC7(bqu3);
            return true;
        } else if (action == 5) {
            view.setBackgroundColor(-2131824914);
            this.A00.A02 = C108955ca.A0m();
            return true;
        } else if (action != 6) {
            return false;
        } else {
            view.setBackgroundColor(-2134061876);
            this.A00.A03 = C108955ca.A0m();
            return true;
        }
    }
}
