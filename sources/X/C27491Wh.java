package X;

import android.content.SharedPreferences;
import java.util.UUID;

/* renamed from: X.1Wh  reason: invalid class name and case insensitive filesystem */
public final class C27491Wh {
    public final AnonymousClass00H A00;
    public final long A01;
    public final AnonymousClass11P A02;

    public C27491Wh(AnonymousClass11P r3, C18030ve r4, AnonymousClass00H r5) {
        C18070vi.A0d(r4, 1);
        C18070vi.A0d(r3, 2);
        C18070vi.A0d(r5, 3);
        this.A02 = r3;
        this.A00 = r5;
        this.A01 = (long) C18020vd.A00(C18040vf.A02, r4, 3860);
    }

    public final int A00() {
        long A012 = AnonymousClass11P.A01(this.A02);
        AnonymousClass00H r7 = this.A00;
        int i = ((A012 - C30541e7.A00((C30541e7) r7.get()).getLong("last_interaction_timestamp", -1)) > this.A01 ? 1 : ((A012 - C30541e7.A00((C30541e7) r7.get()).getLong("last_interaction_timestamp", -1)) == this.A01 ? 0 : -1));
        SharedPreferences A002 = C30541e7.A00((C30541e7) r7.get());
        if (i <= 0) {
            A002.edit().putLong("last_interaction_timestamp", A012).apply();
            return C30541e7.A00((C30541e7) r7.get()).getInt("session_id", -1);
        }
        SharedPreferences.Editor edit = A002.edit();
        edit.putInt("session_id", -1);
        edit.putLong("last_interaction_timestamp", -1);
        edit.putLong("session_start_timestamp", -1);
        edit.putInt("bit_array_session_sequence", 0);
        edit.putInt("cumulative_bits", 0);
        edit.apply();
        int leastSignificantBits = (int) UUID.randomUUID().getLeastSignificantBits();
        C30541e7.A00((C30541e7) r7.get()).edit().putInt("session_id", leastSignificantBits).apply();
        C30541e7.A00((C30541e7) r7.get()).edit().putLong("session_start_timestamp", A012).apply();
        C30541e7.A00((C30541e7) r7.get()).edit().putLong("last_interaction_timestamp", A012).apply();
        return leastSignificantBits;
    }

    public final long A01(long j) {
        return j - C30541e7.A00((C30541e7) this.A00.get()).getLong("session_start_timestamp", -1);
    }
}
