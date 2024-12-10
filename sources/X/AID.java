package X;

import android.os.Looper;
import android.os.Message;

public class AID implements C22550BCh {
    public final C22550BCh[] A00;

    public void BLJ(Message message) {
        for (C22550BCh BLJ : this.A00) {
            BLJ.BLJ(message);
        }
    }

    public void BLK() {
        for (C22550BCh BLK : this.A00) {
            BLK.BLK();
        }
    }

    public void CNm(Message message) {
        for (C22550BCh CNm : this.A00) {
            CNm.CNm(message);
        }
    }

    public void CNq(Looper looper, String str) {
        for (C22550BCh CNq : this.A00) {
            CNq.CNq(looper, str);
        }
    }

    public void CNs() {
        for (C22550BCh CNs : this.A00) {
            CNs.CNs();
        }
    }

    public AID(C22550BCh... bChArr) {
        this.A00 = bChArr;
    }
}
