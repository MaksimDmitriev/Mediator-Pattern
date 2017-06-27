package com.api;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by admin on 27/06/2017.
 */
public class User {

    private final Set<Group> mGroups = new HashSet<>();
    private final int mId;

    public User(int id) {
        mId = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof User)) {
            return false;
        }
        User other = (User) obj;
        return mId == other.mId;
    }

    @Override
    public int hashCode() {
        return mId;
    }

    /**
     *
     * @param group
     * @return if {@link Group#mUsers} have been changed
     */
    public boolean joinGroup(Group group) {
        return mGroups.add(group);
    }
}
