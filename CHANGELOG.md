<!-- Keep a Changelog guide -> https://keepachangelog.com -->

# live-templates-plus-hutool Changelog

## [Unreleased]

### Added

1. 增加模板参数自动补全
2. 针对 MybatisSqlContext 新增模板语法
    - iftest -&gt; &lt;if test="VAR != null"&gt;&lt;/if&gt;
    - ifteststr -&gt; &lt;if test="VAR != null and VAR != ''"&gt;&lt;/if&gt;
    - iftestcol -&gt; &lt;if test="VAR != null and VAR.size() &gt; 0"&gt;&lt;/if&gt;
    - foreach -&gt; &lt;foreach item="item" index="index" collection="VAR" open="(" separator="," close=")"
      &gt;#{item}&lt;/foreach&gt;
    - cd -&gt; &lt;![CDATA[]]&gt;

----

1. add templates param auto completion
2. for MybatisSqlContext

- iftest -&gt; &lt;if test="VAR != null"&gt;&lt;/if&gt;
- ifteststr -&gt; &lt;if test="VAR != null and VAR != ''"&gt;&lt;/if&gt;
- iftestcol -&gt; &lt;if test="VAR != null and VAR.size() &gt; 0"&gt;&lt;/if&gt;
- foreach -&gt; &lt;foreach item="item" index="index" collection="VAR" open="(" separator="," close=")"
  &gt;#{item}&lt;/foreach&gt;
- cd -&gt; &lt;![CDATA[]]&gt;

### More

- Please See [Help Document](https://www.wolai.com/haozhe/oMDRF7Rn6j4kVpgt8H8N9j)