# 项目名称
Hope

## 本地运行步骤
1. 确保已安装 JDK 17 和 Maven。
2. 克隆项目：
   ```bash
   git clone <repository-url>
   cd hope
   ```
3. 启动应用：
   ```bash
   mvn spring-boot:run
   ```
4. 访问接口：
   - `http://localhost:8080/api/hello`
   - `http://localhost:8080/api/users`

## Docker 打包与运行步骤
1. 构建 Docker 镜像：
   ```bash
   docker build -t hope-app .
   ```
2. 启动容器：
   ```bash
   docker run -p 8080:8080 hope-app
   ```

## 使用 Docker Compose
1. 启动服务：
   ```bash
   docker-compose up
   ```
2. 停止服务：
   ```bash
   docker-compose down
   ```

## 阿里云部署步骤
1. 确保服务器已安装 Docker 和 Docker Compose。
2. 上传项目到服务器。
3. 在服务器上运行：
   ```bash
   docker-compose up -d
   ```

## CI/CD 流程说明
1. 推送代码到 `main` 分支后，GitHub Actions 会自动执行以下步骤：
   - 构建项目。
   - 运行测试。
   - 生成 JAR 文件。
2. 可在 GitHub Actions 页面查看执行状态。

## 接口调用示例
### `/hello`
```bash
curl http://localhost:8080/api/hello
```
返回：
```json
{
  "code": 200,
  "message": "Hello World",
  "data": null
}
```

### `/users`
```bash
curl http://localhost:8080/api/users
```
返回：
```json
{
  "code": 200,
  "message": "Success",
  "data": [
    {
      "id": 1,
      "username": "user1",
      "email": "user1@example.com",
      "createdAt": "2023-09-24T00:00:00"
    },
    {
      "id": 2,
      "username": "user2",
      "email": "user2@example.com",
      "createdAt": "2023-09-24T00:00:00"
    }
  ]
}
```