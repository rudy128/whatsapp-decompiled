package X;

import android.net.Uri;
import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.WaTextView;
import com.whatsapp.settings.SettingsChat;

public class AGJ implements AnonymousClass02j {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public AGJ(Uri uri, AnonymousClass01C r2, C218417p r3, C22821Di r4, int i) {
        this.A00 = i;
        if (1 - i != 0) {
            this.A01 = r4;
            this.A02 = uri;
            this.A03 = r3;
            this.A04 = r2;
            return;
        }
        this.A01 = r3;
        this.A02 = r2;
        this.A03 = uri;
        this.A04 = r4;
    }

    public final void Bkx(Object obj) {
        switch (this.A00) {
            case 0:
                SettingsChat settingsChat = (SettingsChat) this.A01;
                CompoundButton compoundButton = (CompoundButton) this.A02;
                View view = (View) this.A03;
                Object obj2 = this.A04;
                if (((C005702m) obj).A00 == -1) {
                    compoundButton.setChecked(true);
                    SettingsChat.A0V(view, settingsChat, true);
                    if (settingsChat.A03 != null) {
                        settingsChat.A05.CGF(new C146527Pl(settingsChat, obj2, 19));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                C218417p r4 = (C218417p) this.A01;
                AnonymousClass01C r3 = (AnonymousClass01C) this.A02;
                Uri uri = (Uri) this.A03;
                C22821Di r1 = (C22821Di) this.A04;
                if (AnonymousClass000.A1Y(obj)) {
                    r4.A00(uri, r3, r1);
                }
                AnonymousClass02n r0 = r4.A01;
                if (r0 != null) {
                    r0.A01();
                    return;
                }
                return;
            default:
                C22821Di r42 = (C22821Di) this.A01;
                Object obj3 = this.A02;
                C218417p r32 = (C218417p) this.A03;
                AnonymousClass1FB r2 = (AnonymousClass1FB) this.A04;
                if (AnonymousClass000.A1Y(obj)) {
                    try {
                        r42.invoke(new AnonymousClass97B(C18070vi.A0H(obj3)));
                    } catch (SecurityException e) {
                        r42.invoke(new AnonymousClass97A(e.toString()));
                    }
                } else {
                    r42.invoke(AnonymousClass97C.A00);
                }
                AnonymousClass02n r02 = r32.A00;
                if (r02 != null) {
                    r02.A01();
                }
                r2.getLifecycle().A06(r32);
                return;
        }
    }

    public AGJ(View view, SwitchCompat switchCompat, WaTextView waTextView, SettingsChat settingsChat) {
        this.A00 = 0;
        this.A01 = settingsChat;
        this.A02 = switchCompat;
        this.A03 = view;
        this.A04 = waTextView;
    }
}
