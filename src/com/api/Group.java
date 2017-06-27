package com.api;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by admin on 27/06/2017.
 */
public class Group {

    private final Set<User> mUsers = new HashSet<>();
    private final int mId;

    public Group(int id) {
        mId = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Group)) {
            return false;
        }
        Group other = (Group) obj;
        return mId == other.mId;
    }

    @Override
    public int hashCode() {
        return mId;
    }

    /**
     *
     * @param user
     * @return if {@link Group#mUsers} have been changed
     */
    public boolean addToGroup(User user) {
        return mUsers.add(user);
    }
}
