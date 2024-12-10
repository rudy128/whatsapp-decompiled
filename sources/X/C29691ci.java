package X;

import android.content.ContentValues;
import com.whatsapp.util.Log;

/* renamed from: X.1ci  reason: invalid class name and case insensitive filesystem */
public class C29691ci {
    public int A00 = 0;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public long A0E = 1;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J = Long.MIN_VALUE;
    public long A0K;
    public long A0L;
    public long A0M;
    public long A0N = 1;
    public long A0O = 0;
    public long A0P = 1;
    public long A0Q = Long.MIN_VALUE;
    public long A0R = 1;
    public long A0S = Long.MIN_VALUE;
    public long A0T;
    public long A0U;
    public long A0V = 0;
    public long A0W = 1;
    public long A0X = Long.MIN_VALUE;
    public long A0Y = -1;
    public long A0Z;
    public long A0a;
    public C49502Qs A0b;
    public C29701cj A0c = C29701cj.UNSET;
    public C59162lr A0d;
    public C29721cl A0e;
    public AnonymousClass206 A0f;
    public AnonymousClass206 A0g;
    public C29741cn A0h;
    public C53812d8 A0i;
    public String A0j;
    public String A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o = false;
    public boolean A0p = false;
    public boolean A0q = true;
    public boolean A0r;
    public boolean A0s;
    public boolean A0t;
    public final AnonymousClass1BI A0u;
    public volatile AnonymousClass25L A0v;
    public volatile transient Boolean A0w;
    public volatile transient Boolean A0x;

    public synchronized long A03() {
        return this.A0O;
    }

    public synchronized long A04() {
        return this.A0V;
    }

    public synchronized long A05() {
        return this.A0Z;
    }

    public synchronized ContentValues A06() {
        ContentValues contentValues;
        contentValues = new ContentValues(4);
        contentValues.put("unseen_message_count", Integer.valueOf(this.A0A));
        contentValues.put("unseen_comment_message_count", Integer.valueOf(this.A07));
        contentValues.put("unseen_missed_calls_count", Integer.valueOf(this.A0B));
        contentValues.put("unseen_row_count", Integer.valueOf(this.A0C));
        contentValues.put("unseen_earliest_message_received_time", Long.valueOf(this.A0a));
        return contentValues;
    }

    public synchronized ContentValues A07(Long l) {
        ContentValues contentValues;
        contentValues = new ContentValues();
        contentValues.put("display_message_row_id", Long.valueOf(this.A0W));
        contentValues.put("display_message_sort_id", Long.valueOf(this.A0X));
        contentValues.put("last_message_row_id", Long.valueOf(this.A0P));
        contentValues.put("last_message_sort_id", Long.valueOf(this.A0Q));
        contentValues.put("last_read_message_row_id", Long.valueOf(this.A0R));
        contentValues.put("last_read_message_sort_id", Long.valueOf(this.A0S));
        contentValues.put("last_read_receipt_sent_message_row_id", Long.valueOf(this.A0T));
        contentValues.put("last_read_receipt_sent_message_sort_id", Long.valueOf(this.A0U));
        contentValues.put("unseen_earliest_message_received_time", Long.valueOf(this.A0a));
        contentValues.put("unseen_message_count", Integer.valueOf(this.A0A));
        contentValues.put("unseen_missed_calls_count", Integer.valueOf(this.A0B));
        contentValues.put("unseen_row_count", Integer.valueOf(this.A0C));
        contentValues.put("last_important_message_row_id", Long.valueOf(this.A0N));
        contentValues.put("show_group_description", Integer.valueOf(this.A0t ? 1 : 0));
        contentValues.put("ephemeral_expiration", Integer.valueOf(this.A0e.expiration));
        contentValues.put("ephemeral_setting_timestamp", Long.valueOf(this.A0e.ephemeralSettingTimestamp));
        contentValues.put("ephemeral_disappearing_messages_initiator", Integer.valueOf(this.A0e.disappearingMessagesInitiator));
        contentValues.put("subject", this.A0k);
        contentValues.put("archived", Integer.valueOf(this.A0l ? 1 : 0));
        contentValues.put("sort_timestamp", Long.valueOf(this.A0Z));
        contentValues.put("change_number_notified_message_row_id", Long.valueOf(this.A0E));
        contentValues.put("spam_detection", Integer.valueOf(this.A06));
        contentValues.put("plaintext_disabled", Integer.valueOf(this.A01));
        contentValues.put("vcard_ui_dismissed", Integer.valueOf(this.A0D));
        if (l != null) {
            contentValues.put("created_timestamp", l);
        }
        contentValues.put("unseen_important_message_count", Integer.valueOf(this.A08));
        contentValues.put("group_type", Integer.valueOf(this.A03));
        contentValues.put("unseen_message_reaction_count", Integer.valueOf(this.A09));
        contentValues.put("unseen_comment_message_count", Integer.valueOf(this.A07));
        contentValues.put("last_message_reaction_row_id", Long.valueOf(this.A0O));
        contentValues.put("last_seen_message_reaction_row_id", Long.valueOf(this.A0V));
        contentValues.put("has_new_community_admin_dialog_been_acknowledged", Boolean.valueOf(this.A0n));
        contentValues.put("history_sync_progress", Integer.valueOf(this.A04));
        contentValues.put("chat_lock", Integer.valueOf(this.A0m ? 1 : 0));
        contentValues.put("hidden", Integer.valueOf(this.A0s ? 1 : 0));
        C49502Qs r0 = this.A0b;
        if (r0 != null) {
            contentValues.put("chat_origin", r0.origin);
        }
        contentValues.put("participation_status", Integer.valueOf(this.A0c.status));
        contentValues.put("chat_encryption_state", Integer.valueOf(this.A00));
        return contentValues;
    }

    public synchronized AnonymousClass1BI A08() {
        return this.A0u;
    }

    public synchronized Long A09() {
        return Long.valueOf(this.A0Y);
    }

    public synchronized String A0A() {
        return this.A0k;
    }

    public synchronized String A0B() {
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append(this.A0C);
        sb.append("/");
        sb.append(this.A0A);
        sb.append("/");
        sb.append(this.A0B);
        sb.append("/");
        sb.append(this.A0a);
        sb.append("/");
        sb.append(this.A08);
        sb.append("/");
        sb.append(this.A0O - this.A0V);
        return sb.toString();
    }

    public synchronized void A0C() {
        this.A0g = null;
        this.A0f = null;
        this.A0i = null;
        this.A0W = 1;
        this.A0X = Long.MIN_VALUE;
        this.A0P = 1;
        this.A0Q = Long.MIN_VALUE;
        this.A0N = 1;
        this.A0R = 1;
        this.A0S = Long.MIN_VALUE;
        this.A0T = 1;
        this.A0U = Long.MIN_VALUE;
        this.A0J = Long.MIN_VALUE;
        A0K(0, 0, 0, 0);
    }

    public synchronized void A0D(int i) {
        this.A06 = i;
    }

    public synchronized void A0F(long j) {
        this.A0W = j;
    }

    public synchronized void A0G(long j) {
        this.A0X = j;
    }

    public synchronized void A0H(long j) {
        this.A0Z = j;
    }

    public synchronized void A0I(AnonymousClass206 r2) {
        this.A0f = r2;
    }

    public synchronized void A0J(String str, long j, long j2, long j3, long j4) {
        this.A0H = j;
        this.A0I = j2;
        this.A0F = j3;
        this.A0G = j4;
        this.A0j = str;
        this.A0x = null;
        this.A0w = null;
    }

    public synchronized boolean A0K(int i, int i2, int i3, int i4) {
        if (this.A0A == i && this.A0B == i2 && this.A0C == i3 && this.A08 == i4) {
            return false;
        }
        if (i <= 0) {
            this.A0a = 0;
        }
        this.A0A = i;
        this.A08 = i4;
        this.A0B = i2;
        this.A0C = i3;
        this.A07 = 0;
        return true;
    }

    public void A0E(int i, long j, int i2) {
        this.A0e = new C29721cl(i, j, i2);
    }

    public boolean A0L(Boolean bool, int i) {
        C59162lr r1 = new C59162lr(bool, i);
        C59162lr r0 = this.A0d;
        if (r0 != null && r0.equals(r1)) {
            return false;
        }
        this.A0d = r1;
        return true;
    }

    public C29691ci(C29691ci r7) {
        if (r7.A0u == null) {
            Log.e("ChatInfo got null JID", new NullPointerException());
        }
        this.A0u = r7.A0u;
        this.A0Y = r7.A0Y;
        this.A0W = r7.A0W;
        this.A0X = r7.A0X;
        this.A0g = r7.A0g;
        this.A0f = r7.A0f;
        this.A0i = r7.A0i;
        this.A0R = r7.A0R;
        this.A0S = r7.A0S;
        this.A0T = r7.A0T;
        this.A0U = r7.A0U;
        this.A0l = r7.A0l;
        this.A0Z = r7.A0Z;
        this.A06 = r7.A06;
        this.A01 = r7.A01;
        this.A0D = r7.A0D;
        this.A0k = r7.A0k;
        this.A0J = r7.A0J;
        this.A0a = r7.A0a;
        this.A04 = r7.A04;
        this.A0A = r7.A0A;
        this.A0B = r7.A0B;
        this.A0C = r7.A0C;
        this.A08 = r7.A08;
        this.A09 = r7.A09;
        this.A07 = r7.A07;
        this.A0O = r7.A0O;
        this.A0V = r7.A0V;
        this.A0P = r7.A0P;
        this.A0N = r7.A0N;
        this.A0H = r7.A0H;
        this.A0I = r7.A0I;
        this.A0F = r7.A0F;
        this.A0G = r7.A0G;
        this.A0j = r7.A0j;
        this.A0E = r7.A0E;
        this.A0t = r7.A0t;
        this.A0n = r7.A0n;
        this.A0q = r7.A0q;
        this.A0p = r7.A0p;
        this.A0o = r7.A0o;
        this.A02 = r7.A02;
        this.A0e = r7.A0e;
        this.A03 = r7.A03;
        this.A0M = r7.A0M;
        this.A0L = r7.A0L;
        this.A0K = r7.A0K;
        this.A0h = r7.A0h;
        this.A0r = r7.A0r;
        this.A0s = r7.A0s;
        this.A0x = r7.A0x;
        this.A0w = r7.A0w;
        this.A0Q = r7.A0Q;
        this.A0b = r7.A0b;
        this.A0d = r7.A0d;
        this.A0c = r7.A0c;
        this.A00 = r7.A00;
    }

    public C29691ci(AnonymousClass1BI r8) {
        if (r8 == null) {
            Log.e("ChatInfo got null JID", new NullPointerException());
        }
        this.A0u = r8;
        this.A02 = 0;
        this.A0e = new C29721cl(0, 0, 0);
        this.A0H = Long.MIN_VALUE;
        this.A0I = Long.MIN_VALUE;
        this.A0F = Long.MIN_VALUE;
        this.A0G = Long.MIN_VALUE;
    }
}
