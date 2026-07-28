<!-- Keep a Changelog guide -> https://keepachangelog.com -->

# live-templates-plus-hutool Changelog

## [Released]

### Added

- 新增 String 系列模板：`strc` / `ifstrc`（contains）、`strsw` / `ifstrsw`（startWith）、`strtrim`（trim）、`strsub`（sub）
- 新增 ObjectUtil 模板：`obndef`（defaultIfNull）
- 新增 BeanUtil 模板：`beancopy`（copyProperties，目标参数使用 className 补全）
- 新增 UUID 模板：`uuid`（fastSimpleUUID）

### Fixed

- 修复多参数模板 `$END$` 被当作参数占位符的问题：`stre` / `ifstre` / `strne` / `ifstrne` / `strfmt` / `mapsin` 改为独立变量 `$VAR1$` + `$VAR2$`
- 修复 `mapnew` 重复定义 `VAR1`、缺少 `VAR2` 定义
- 修复 `iftest` 使用 `$VAR$` 但未声明变量定义
- 修复 `ifstre` / `ifstrne` 存在两个 `$END$` 的问题
- 修复 `datefmt` 命名冲突：注解模板重命名为 `datetimefmt`
- 修复 Log 系列模板（`logi` / `logw` / `loge`）多变量场景下 `completeSmart()` 不弹出补全，改为 `complete()`
- 修复 `listnew` 中 `$END$` 当作变量名占位符，改为 `$VAR2$`
- 修复 `fileex` / `iffileex` / `filenex` / `iffilenex` 无代码补全（`expression=""`）
- 修复 `arrnew` 数组类型和元素无代码补全
- 修复 `loge` 硬编码 `e.getMessage(), e`，改为 `$EX$` 变量（默认值 `e`）

### Changed

- 代码补全策略：多变量模板中 `completeSmart()` 改为 `complete()`，避免前置自动解析变量导致 PSI 类型推断失败
- XML 文件按工具类重新分组排序，添加分级注释，便于查阅

----
### Full Help Document

- Please See [Help Document](https://www.wolai.com/haozhe/oMDRF7Rn6j4kVpgt8H8N9j)