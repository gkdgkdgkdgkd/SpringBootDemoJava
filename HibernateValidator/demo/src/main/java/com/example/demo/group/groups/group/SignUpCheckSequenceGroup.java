package com.example.demo.group.groups.group;

import com.example.demo.group.groups.sequence.SignUpFirstCheck;
import com.example.demo.group.groups.sequence.SignUpSecondCheck;
import com.example.demo.group.groups.sequence.SignUpThirdCheck;

import javax.validation.GroupSequence;

@GroupSequence({SignUpFirstCheck.class, SignUpSecondCheck.class, SignUpThirdCheck.class})
public interface SignUpCheckSequenceGroup {
}
