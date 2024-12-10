package X;

/* renamed from: X.BlR  reason: case insensitive filesystem */
public final class C23538BlR extends DVG {
    public int index;
    public final Object key;
    public final /* synthetic */ C27300DbW this$0;

    public C23538BlR(C27300DbW dbW, int i) {
        this.this$0 = dbW;
        this.key = dbW.keys[i];
        this.index = i;
    }

    public Object getKey() {
        return this.key;
    }

    public void updateIndex() {
        int i = this.index;
        if (i != -1) {
            C27300DbW dbW = this.this$0;
            if (i <= dbW.size && C24604CBi.A00(dbW.keys[i], this.key)) {
                return;
            }
        }
        this.index = this.this$0.findEntryByKey(this.key);
    }

    public Object getValue() {
        updateIndex();
        int i = this.index;
        if (i == -1) {
            return C24607CBl.unsafeNull();
        }
        return this.this$0.values[i];
    }

    public Object setValue(Object obj) {
        updateIndex();
        int i = this.index;
        C27300DbW dbW = this.this$0;
        if (i == -1) {
            dbW.put(this.key, obj);
            return C24607CBl.unsafeNull();
        }
        Object obj2 = dbW.values[i];
        if (C24604CBi.A00(obj2, obj)) {
            return obj;
        }
        this.this$0.replaceValueInEntry(this.index, obj, false);
        return obj2;
    }
}
