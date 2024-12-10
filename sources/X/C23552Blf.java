package X;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Blf  reason: case insensitive filesystem */
public class C23552Blf extends C23541BlU implements C28579E8q {
    public static final long serialVersionUID = 0;
    public final transient C199410f emptySet = emptySet((Comparator) null);

    public C23552Blf(C201110w r2, int i, Comparator comparator) {
        super(r2, i);
    }

    public static C23552Blf copyOf(C28579E8q e8q, Comparator comparator) {
        C199610h.A04(e8q);
        if (e8q.isEmpty()) {
            return of();
        }
        if (e8q instanceof C23552Blf) {
            return (C23552Blf) e8q;
        }
        return fromMapEntries(e8q.asMap().entrySet(), (Comparator) null);
    }

    public static C23552Blf fromMapEntries(Collection collection, Comparator comparator) {
        if (collection.isEmpty()) {
            return of();
        }
        C201210x r5 = new C201210x(collection.size());
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(it);
            Object key = A16.getKey();
            C199410f valueSet = valueSet((Comparator) null, (Collection) A16.getValue());
            if (!valueSet.isEmpty()) {
                r5.put(key, valueSet);
                i += valueSet.size();
            }
        }
        return new C23552Blf(r5.buildOrThrow(), i, (Comparator) null);
    }

    public static C23551Ble builder() {
        return new C23551Ble();
    }

    public static C199410f emptySet(Comparator comparator) {
        if (comparator == null) {
            return C199410f.of();
        }
        return C23556Blj.emptySet(comparator);
    }

    public static C23552Blf of() {
        return Blk.INSTANCE;
    }

    public static AnonymousClass1F8 valuesBuilder(Comparator comparator) {
        if (comparator == null) {
            return new AnonymousClass1F8();
        }
        return new C23553Blg(comparator);
    }

    public C199410f get(Object obj) {
        Object obj2 = this.map.get(obj);
        C199410f r0 = this.emptySet;
        if (obj2 == null) {
            if (r0 != null) {
                obj2 = r0;
            } else {
                throw AnonymousClass000.A0s("Both parameters are null");
            }
        }
        return (C199410f) obj2;
    }

    public Comparator valueComparator() {
        C199410f r1 = this.emptySet;
        if (r1 instanceof C23556Blj) {
            return ((C23556Blj) r1).comparator();
        }
        return null;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            C201210x builder = C201110w.builder();
            int i = 0;
            int i2 = 0;
            while (i < readInt) {
                Object readObject = objectInputStream.readObject();
                readObject.getClass();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    AnonymousClass1F8 valuesBuilder = valuesBuilder(comparator);
                    int i3 = 0;
                    do {
                        Object readObject2 = objectInputStream.readObject();
                        readObject2.getClass();
                        valuesBuilder.add(readObject2);
                        i3++;
                    } while (i3 < readInt2);
                    C199410f build = valuesBuilder.build();
                    if (build.size() == readInt2) {
                        builder.put(readObject, build);
                        i2 += readInt2;
                        i++;
                    } else {
                        throw new InvalidObjectException(AnonymousClass001.A1E(readObject, "Duplicate key-value pairs exist for key ", AnonymousClass000.A10()));
                    }
                } else {
                    throw new InvalidObjectException(AnonymousClass001.A1I("Invalid value count ", AnonymousClass000.A10(), readInt2));
                }
            }
            try {
                CHN.MAP_FIELD_SETTER.set((Object) this, (Object) builder.buildOrThrow());
                CHN.SIZE_FIELD_SETTER.set((Object) this, i2);
                CFi.EMPTY_SET_FIELD_SETTER.set((Object) this, (Object) emptySet(comparator));
            } catch (IllegalArgumentException e) {
                throw new InvalidObjectException(e.getMessage()).initCause(e);
            }
        } else {
            throw new InvalidObjectException(AnonymousClass001.A1I("Invalid key count ", AnonymousClass000.A10(), readInt));
        }
    }

    public static C199410f valueSet(Comparator comparator, Collection collection) {
        return C199410f.copyOf(collection);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(valueComparator());
        C26230CvM.writeMultimap(this, objectOutputStream);
    }

    public static C23552Blf copyOf(C28579E8q e8q) {
        return copyOf(e8q, (Comparator) null);
    }
}
