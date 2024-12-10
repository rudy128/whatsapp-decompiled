package X;

/* renamed from: X.Bll  reason: case insensitive filesystem */
public class C23557Bll extends C25259Cby {
    public final Object key;
    public int lastKnownIndex;
    public final /* synthetic */ C26286Cwi this$0;

    public C23557Bll(C26286Cwi cwi, int i) {
        this.this$0 = cwi;
        this.key = cwi.keys[i];
        this.lastKnownIndex = i;
    }

    public Object getElement() {
        return this.key;
    }

    public void updateLastKnownIndex() {
        int i = this.lastKnownIndex;
        if (i != -1) {
            C26286Cwi cwi = this.this$0;
            if (i < cwi.size() && C24604CBi.A00(this.key, cwi.keys[i])) {
                return;
            }
        }
        this.lastKnownIndex = this.this$0.indexOf(this.key);
    }

    public int getCount() {
        updateLastKnownIndex();
        int i = this.lastKnownIndex;
        if (i == -1) {
            return 0;
        }
        return this.this$0.values[i];
    }
}
