package X;

import com.whatsapp.util.Log;

/* renamed from: X.7BB  reason: invalid class name */
public class AnonymousClass7BB implements C28606E9x {
    public final /* synthetic */ C121616Kv A00;

    public void C0j() {
    }

    public void C0r(int i, boolean z) {
    }

    public void C0z(int i) {
    }

    public void C8e() {
    }

    public void C93(C26539D3a d3a) {
    }

    public AnonymousClass7BB(C121616Kv r1) {
        this.A00 = r1;
    }

    public void CAS(C0Q c0q, String str) {
        if (C0Q.A0B == c0q) {
            AnonymousClass190 r3 = this.A00.A01;
            if (r3 != null) {
                r3.A0G("exoaudioplayer/audio-track-not-playable", (String) null, false);
            }
            Log.e("exoaudioplayer/onTracksChanged: Media includes audio tracks, but none are playable by this device");
        }
    }

    public void C0p(C24399C1u c1u, C0Q c0q) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("exoaudioplayer/onPlayerError: ");
        C17890vO.A19(A10, c1u.toString());
    }
}
