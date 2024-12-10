package X;

/* renamed from: X.BlT  reason: case insensitive filesystem */
public final class C23540BlT extends DVG {
    public final C27300DbW biMap;
    public int index;
    public final Object value;

    private void updateIndex() {
        int i = this.index;
        if (i != -1) {
            C27300DbW dbW = this.biMap;
            if (i <= dbW.size && C24604CBi.A00(this.value, dbW.values[i])) {
                return;
            }
        }
        this.index = this.biMap.findEntryByValue(this.value);
    }

    public Object getKey() {
        return this.value;
    }

    public C23540BlT(C27300DbW dbW, int i) {
        this.biMap = dbW;
        this.value = dbW.values[i];
        this.index = i;
    }

    public Object getValue() {
        updateIndex();
        int i = this.index;
        if (i == -1) {
            return C24607CBl.unsafeNull();
        }
        return this.biMap.keys[i];
    }

    public Object setValue(Object obj) {
        updateIndex();
        int i = this.index;
        C27300DbW dbW = this.biMap;
        if (i == -1) {
            dbW.putInverse(this.value, obj, false);
            return C24607CBl.unsafeNull();
        }
        Object obj2 = dbW.keys[i];
        if (C24604CBi.A00(obj2, obj)) {
            return obj;
        }
        this.biMap.replaceKeyInEntry(this.index, obj, false);
        return obj2;
    }
}
